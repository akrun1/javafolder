import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RVector;
import org.rosuda.JRI.RList;
import java.util.Vector;
import org.rosuda.JRI.Rengine;



public class callingR {

    public static void main(String[] args) {

        //Call the function that connects with R and gets the forecast output
        forecastOut();
        System.out.println("\nForecast output completed!");

    }

    public static void forecastOut() {

        // Create an instance of Rengine
        Rengine reng = new Rengine(new String[]{"--vanilla"}, false, null);


        System.out.println("Rengine created, waiting for R");

        // funcNameGenerator returns all the function names that starts with 'generate' from the R package forecastpack as a string
        AlgoGenerator algos = new AlgoGenerator();
        reng.eval(algos.funcNameGenerator("forecastpack", "^generate"));

        // Get the length of the R vector object that have all the function names
        int n1 = reng.eval("length(fnNm)").asInt();

        // Create an RList object of the function names
        RList fnAll = reng.eval("as.list(fnNm)").asList();

        // Used inbuilt iris dataset for testing
        // A single column dataset as train data - 'y' column is 'Sepal.Length'
        reng.eval("data(iris)", false);
        String rSL = "iris['Sepal.Length']";


        // Call the funcExprGenerator in a loop that creates a function expression for each algos that is passed into R for evaluation
        // Print the output of forecast output generated from R
        for(int i=0; i <= (n1-1); i++) {
            System.out.println(algos.funcExprGenerator(fnAll.at(i).asString(), rSL));
            System.out.println(reng.eval(algos.funcExprGenerator(fnAll.at(i).asString(), rSL)));

        }


        reng.end();


    }
}

class AlgoGenerator {

        // funNameGenerator gets all the function names from the namespace of the package
        // It also outputs some additional elements that are not needed.  So used grep
        // All the forecast algo function names start with 'generate' - goes into the pattern argument
        public String funcNameGenerator(String pkgName, String pattern){
            return String.format("fnNm <- grep('%s', ls(getNamespace('%s'), all.names = TRUE), value = TRUE)", pattern, pkgName);

    }

        // Load the relevant libraries needed in R
        // Create the function expression with String.format
        // For testing purpose, some arguments are hard-coded (will replcae it with function arguments)
        public String funcExprGenerator(String funcName, String dataObj) {
            return String.format("{library(fable);" +
                                 "library(tsibble);" +
                                  "forecastpack::%s(data = %s, testing_data_length = 100, forecast_frequency = 53, tscomponent = 'trend')}",
                                            funcName, dataObj);
        }




    }








