def function1():
    print("Pratham called")

def function2():
    print("Paridhi called")

# Define a dictionary mapping cases to functions
cases = {
    1: function1,
    2: function2
}

# Ask the user to input a number
n = int(input("Enter a number (1 or 2): "))

# Use a dictionary to emulate switch behavior
# Get the function corresponding to the input number and call it
cases.get(n, lambda: print("Invalid input."))()