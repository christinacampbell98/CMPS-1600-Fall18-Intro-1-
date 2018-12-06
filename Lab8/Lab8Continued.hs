{-# OPTIONS_GHC -Wall #-}
--Christina Campbell
module LAB7 where

-- Exercise 1 -----------------------------------------

-- Get the last digit from a number
lastDigit :: Integer -> Integer
lastDigit x
    | (x< 0) = ((-1) * x) `rem` 10
    | otherwise = x `rem` 10

--Drop the last digit from a number
dropLastDigit :: Integer -> Integer
dropLastDigit x = div x 10

-- Exercise 2 -----------------------------------------

toRevDigits :: Integer -> [Integer]
toRevDigits x
    | (x< 1) = []
    | otherwise = [x `mod` 10]++ toRevDigits (x `div` 10) 
-- Exercise 3 -----------------------------------------

-- Double every second number in a list starting on the left.

doubleEveryOther :: [Integer] -> [Integer]
doubleEveryOther [] = []
doubleEveryOther [x] =[x]
doubleEveryOther (x:y:xs) = (x:(2*y):(doubleEveryOther xs)) 


-- Exercise 4 -----------------------------------------

-- Calculate the sum of all the digits in every Integer.
sumDigits :: [Integer] -> Integer
sumDigits [] = 0
sumDigits (x:xs) =  (dropLastDigit x + lastDigit x) + sumDigits xs


-- Exercise 5 -----------------------------------------

-- Validate a credit card number using the above functions.
luhn :: Integer -> Bool
luhn x = if sumDigits (doubleEveryOther (toRevDigits x)) `rem` 10 == 0 then True else False


 
