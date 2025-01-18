# Android
Name: RajyaLakshmi Ketharaju
id: N01635480


Code Explanation:
This Android app lets users calculate the perimeter and area of a rectangle. It includes input fields for length and width, buttons for calculation and resetting, and a text area to display results. When the Calculate button is clicked, the app checks if the inputs are valid numbers. If valid, it calculates and displays the perimeter and area three times using a while loop, showing the results in a string. If the inputs are invalid, an error message is displayed. The Reset button clears the input fields and resets the results.

Errors can occur if the user inputs non-numeric values or leaves fields empty, which is handled by the toDoubleOrNull() method. The app also checks for valid input using validateInput() to avoid issues like a NullPointerException. Mistakes in calculation logic, incorrect view references, or improper loop conditions could also cause errors. These issues are managed by input validation, proper logic, and exception handling to ensure the app runs smoothly and displays accurate results.
