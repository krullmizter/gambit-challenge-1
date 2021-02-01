# Gambit challenge #1 (attempt) 
#### Made by: Samuel Granvik


### Option 1: Parsing the Modbus data

Create a program that parses the data, converts it to human readable data like integers, decimals and strings and presents it in a nice way. Depending on your skills and interests you can create a web service that will provide the conversion data, or you could even create a UI to visualize the data somehow, it is entirely up to you what you make of it!

---

### About
This was my first attempt at the Gambit challenge. It began to drag out, and I didn't want to spend anymore time trying to figure things out. So I began work on option [#2](https://github.com/krullmizter/gambit-app). 

The solution isn't working as it should, but it gives some ideas on how I was planning on completing the conversion solution. 

The main idea about my solution was to use Java to go through the register and convert the data accordingly. I used the [RapidTables](https://www.rapidtables.com/) converters to try to figure out what type of datatypes I was working with. The current solution takes in the regsiter values as integers and then uses them in the three different Java methods to convert the data. The integer and long conversion works as it should, but the REAL-4 conversion doesn't work. I had a hard time figuring out how to convert the register input to a IEEE-754 floating point number. 
