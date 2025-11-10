# Stock Price Analyzer 

📊 About the Project
This is a straightforward utility built in Java to perform fundamental statistical analysis on a set of floating-point stock prices. It’s primarily focused on demonstrating core array and ArrayList manipulation techniques, providing quick insights into basic financial data. Perfect for brushing up on your array-traversal and iterative calculation skills!


📈 Analytical Features
 * Average Price Calculation: Computes the arithmetic mean of all stock prices in the dataset.
 * Maximum Price Identification: Efficiently finds the highest recorded price within the array.
 * Occurrence Counting: Determines exactly how many times a specific target price appeared in the trading history.
 * Cumulative Sum (Running Total): Generates a new list (using ArrayList) that tracks the running total of prices a classic data processing task.


⚙️ How to Use It: 
The analysis is pre-loaded with mock data, so you can run it right away and see the results!


🚨 Prerequisites: 
A working installation of the Java Development Kit (JDK) is required.


💻 Behind the Code: 
The most satisfying part of this code is seeing how Java’s data structures are put to work. We use a primitive float[] array for speed and simplicity in the main statistical calculations, and then seamlessly transition to a dynamic ArrayList<Float> for the cumulative sum, illustrating the strengths of both types of collections. The methods are clean, single-purpose, and rely on simple for loops, making them very readable.


🧪 Testing:
The provided main method acts as a self-contained test case, using a hardcoded array of prices to immediately calculate and print all four key metrics.
