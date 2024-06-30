# Online_Voting_System
<hr>
<h2>Introduction</h2>
<hr>
<p>The Online Voting System is a simple, console-based application designed to simulate an electronic voting process. This project allows users to cast votes for different political parties and check the results of the voting. The application is written in Java and provides an interactive way to practice basic programming concepts such as class and object creation, method invocation, user input handling, and conditional statements.</p>
<h2>Objective</h2>
<hr>
<p>The objective of the Online Voting System project is to develop a simple, interactive console-based application that simulates an electronic voting process. This project aims to achieve the following goals:</p>
<ul>
    <h3>1. Educational Purpose:</h3>
    <li><p>Provide a practical example of Java programming concepts, including class and object creation, method invocation, user input handling, and control structures.</p></li>
    <li><p>Help beginners understand how to structure a Java application and manage user interactions through the console.</p></li>
    <h3>2. Simulate a Voting Process:</h3>
    <li><p>Create a user-friendly interface where individuals can cast their votes for different political parties.</p></li>
    <li><p>Ensure that only eligible voters (aged 18 or above) are allowed to vote.</p></li>
    <h3>3. Result Tracking:</h3>
    <li><p>Implement functionality to track the votes cast for each political party.</p></li>
    <li><p>Allow users to check the current voting results for individual parties or view the total votes for all parties.</p></li>
    <h3>4. Practical Application Development:</h3>
    <li><p>Develop an application that handles user input and processes it appropriately to simulate real-world scenarios.</p></li>
    <li><p>Enhance problem-solving skills by addressing challenges such as input validation and resource management.
    </p></li>
    <h3>5. Encourage Further Development:</h3>
    <li><p>Provide a foundation that can be extended with additional features, such as authentication, data persistence, or a graphical user interface.</p></li>
    <li><p>Inspire learners to think about more complex systems and how to implement them using Java.</p></li>
    <h2>Working</h2>
    <hr>
    <h2>Components of the Project</h2>
    <h3>1. voting class</h3>
    <ul>
        <h4><b>Attributes</b></h4>
            <li>name: Stores the name of the voter.</li>
            <li>cnic_no: Stores the CNIC number of the voter.</li>
            <li>age: Stores the age of the voter.</li>
            <li>vote: Stores the party number the voter is voting for.</li>
            <li>result: Stores the result choice for checking votes.</li>
            <li>Static variables for vote counts: ppp, pti, pmln, mqm, ind.</li>
        <h4><b>Methods</b></h4>
            <li>setName(), getName(): Setter and getter for the voter's name.</li>
            <li>setCnic_no(), getCnic_no(): Setter and getter for the voter's CNIC number.</li>
            <li>setAge(), getAge(): Setter and getter for the voter's age.</li>
            <li>setVote(), getVote(): Setter and getter for the voter's chosen party.</li>
            <li>setResult(), getResult(): Setter and getter for the result choice.</li>
            <li>CastVote(): Method to cast a vote.</li>
            <li>CheckResult(): Method to check the results of the votes.</li>
    </ul>
    <h3>2. Online Voting System Class</h3>
    <ul>
        <li>Contains the main() method, which is the entry point of the application.</li>
        <li>Creates an instance of the Voting class and provides a menu-driven interface for casting votes and checking results.</li>
    </ul>
    <h2>Execution Flow</h2>
    <h3>1. Program Start</h3>
    <ul>
        <li>The main() method displays the main menu with three options</li>
        <ol type="1">
            <li>Cast Vote</li>
            <li>Check Result</li>
            <li>Exit</li>
        </ol>
    </ul>
    

