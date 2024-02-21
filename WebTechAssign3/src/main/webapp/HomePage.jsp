<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2/19/2024
  Time: 11:27 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Green Navigation Bar</title>
    <style>
        .details{
           align-items: center;
            padding: 10px;
            text-align: center;
        }
        nav {
            background-color: #2ecc71; /* Set green background for navigation bar */
            padding: 15px 0; /* Add padding to top and bottom */
        }

        nav ul {
            list-style-type: none; /* Remove default list style */
            margin: 0;
            padding: 0;
            text-align: center; /* Center align the navigation links */
        }

        nav ul li {
            display: inline; /* Display list items horizontally */
            margin: 0 10px; /* Add margin between list items */
        }

        nav ul li a {
            color: white; /* Set text color to white */
            text-decoration: none; /* Remove underline from links */
            font-size: 18px; /* Set font size */
            padding: 10px 20px; /* Add padding to links */
            border-radius: 5px; /* Add border radius for rounded corners */
        }

        nav ul li a:hover {
            background-color: #27ae60; /* Change background color on hover */
        }

    </style>
</head>
<body>
<nav>
    <ul>
        <li><a href="HomePage.jsp">Home</a></li>
        <li><a href="LoginPage.jsp">Login</a></li>
        <li><a href="AdmissionPage.jsp">Admission</a></li>

    </ul>
</nav>

<!-- Your content goes here -->
<div class="details">
    <h1>Welcome to Our Website</h1>
    <p>This is a simple example of a web page with a white background and a green navigation bar.</p>
</div>
</body>
</html>
