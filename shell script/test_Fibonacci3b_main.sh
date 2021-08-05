#!/bin/bash

echo ' '
echo 'Dynamic Tests for the Main Method of cpsc331.tutorials.Fibonacci3b'
echo ' '
echo 'Executing java cpsc331.tutorials.Fibonacci3b'
echo ' '
echo 'Expected Output:'
echo 'No input found! A nonnegative integer is required.'
echo ' '
echo 'Actual Output:'
java Fibonacci3b
echo ' '
echo 'Rationale: No command-line inputs have been provided.'
echo ' '
echo ' '
echo 'Executing cpsc331.tutorials.Fibonacci3b 1 3'
echo ' '
echo 'Expected Output:'
echo 'Too many inputs found! Only one is required.'
echo ' '
echo 'Actual Output:'
java Fibonacci3b 1 3
echo ' '
echo 'Rationale: More than one command-line input has been provided.'
echo ' '
echo ' '
echo 'Executing cpsc331.tutorials.Fibonacci3b zero'
echo ' '
echo 'Expected Output:'
echo 'The input is not an integer.'
echo ' '
echo 'Actual Output:'
java Fibonacci3b zero
echo ' '
echo 'Rationale: The input is a string, rather than an integer.'
echo ' '
echo ' '
echo 'Executing cpsc331.tutorials.Fibonacci3b -1'
echo ' '
echo 'Expected Output:'
echo 'The input is a negative integer.'
echo ' '
echo 'Actual Output:'
java Fibonacci3b -1
echo ' '
echo 'Rationale: The input really is a negative integer.'
echo ' '
echo ' '
echo 'For all remaining tests, the input is a non-negative integer and'
echo 'the expected output is the corresponding Fibonacci number.'
echo ' '
echo ' '
echo 'Executing cpsc331.tutorials.Fibonacci3b 0'
echo ' '
echo 'Expected Output:'
echo '0'
echo ' '
echo 'Actual Output:'
java Fibonacci3b 0
echo ' '
echo ' '
echo 'Executing cpsc331.tutorials.Fibonacci3b 1'
echo ' '
echo 'Expected Output:'
echo '1'
echo ' '
echo 'Actual Output:'
java Fibonacci3b 1
echo ' '
echo ' '
echo 'Executing cpsc331.tutorials.Fibonacci3b 2'
echo  ' '
echo 'Expected Output:'
echo '1'
echo ' '
echo 'Actual Output:'
java Fibonacci3b 2
echo ' '
echo ' '
echo 'Executing cpsc331.tutorials.Fibonacci3b 3'
echo ' '
echo 'Expected Output:'
echo '2'
echo ' '
echo 'Actual Output:'
java Fibonacci3b 3
echo ' '
echo ' '
echo 'Executing cpsc331.tutorials.Fibonacci3b 4'
echo ' '
echo 'Expected Output:'
echo '3'
echo ' '
echo 'Actual Output:'
java Fibonacci3b 4
echo ' '
echo ' '
echo 'Executing cpsc331.tutorials.Fibonacci3b 5'
echo ' '
echo 'Expected Output:'
echo '5'
echo ' '
echo 'Actual Output:'
java Fibonacci3b 5
echo ' '
echo ' '
echo 'Executing cpsc331.tutorials.Fibonacci3b 10'
echo ' '
echo 'Expected Output:'
echo '55'
echo ' '
echo 'Actual Output:'
java Fibonacci3b 10
echo ' '
echo ' '
echo 'Executing cpsc331.tutorials.Fibonacci3b 46'
echo ' '
echo 'Expected Output:'
echo '1836311903'
echo ' '
echo 'Actual Output:'
java Fibonacci3b 46
echo ' '
echo ' '
echo 'Executing cpsc331.tutorials.Fibonacci3b 47'
echo ' '
echo 'Expected Output:'
echo '2971215073'
echo ' '
echo 'Actual Output:'
java Fibonacci3b 47
echo ' '
echo ' '