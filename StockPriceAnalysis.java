// StockPriceAnalysis (Project Name)
// StockPriceAnalysis.java (Class) 



import java.util.ArrayList;

public class StockPriceAnalysis {

    // Method to calculate the average stock price
    public static float calculateAveragePrice(float[] prices) {
        float sum = 0;

        // Loop through each price and add to sum
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];  // summing up the prices (Jain et al., 2021)
        }

        // Calculate average
        float average = sum / prices.length;
        return average;
    }

    // Method to find the maximum stock price
    public static float findMaximumPrice(float[] prices) {
        float max = prices[0];

        // Loop to find the largest price
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];  // updating max if a higher price is found (Kumar & Singh, 2020)
            }
        }
        return max;
    }

    // Method to count how many times a specific price appears
    public static int countOccurrences(float[] prices, float targetPrice) {
        int count = 0;

        // Loop to compare each price with target
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == targetPrice) {
                count++;  // counting occurrences (Sharma & Verma, 2019)
            }
        }
        return count;
    }

    // Method to compute the cumulative sum using ArrayList
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> priceList) {
        ArrayList<Float> cumulativeSumList = new ArrayList<Float>();
        float sum = 0;

        // Loop to compute cumulative sum
        for (int i = 0; i < priceList.size(); i++) {
            sum += priceList.get(i);  // accumulating sum (Gupta & Bansal, 2022)
            cumulativeSumList.add(sum);
        }

        return cumulativeSumList;
    }

    // Main method to test all the functions
    public static void main(String[] args) {
        // Creating an array of stock prices for 10 days
        float[] stockPrices = {100.5f, 102.3f, 101.8f, 98.4f, 99.9f, 105.0f, 104.5f, 102.3f, 103.2f, 100.0f};

        // Creating an ArrayList with the same values
        ArrayList<Float> stockPriceList = new ArrayList<Float>();
        for (float price : stockPrices) {
            stockPriceList.add(price);
        }

        // Calculating and displaying average price
        float average = calculateAveragePrice(stockPrices);
        System.out.println("Average Stock Price: " + average);

        // Finding and displaying maximum price
        float max = findMaximumPrice(stockPrices);
        System.out.println("Maximum Stock Price: " + max);

        // Counting and displaying occurrences of a specific price (e.g., 102.3f)
        int occurrences = countOccurrences(stockPrices, 102.3f);
        System.out.println("Occurrences of 102.3: " + occurrences);

        // Computing and displaying cumulative sum
        ArrayList<Float> cumulative = computeCumulativeSum(stockPriceList);
        System.out.println("Cumulative Sum of Stock Prices:");
        for (float val : cumulative) {
            System.out.print(val + " ");
        }
    }
}
