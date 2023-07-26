<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> User_dashboard </title>

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Rubik:wght@500&display=swap" rel="stylesheet">

    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons+Outlined" rel="stylesheet">

    <link rel="stylesheet" href="css/admin_dashboard.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="quaries.css">
    <style>
        .c1
        {
            font-Color:red;
        }
    </style>
</head>

<body>
    <menu>
        <p class="heading-pri"> User Home Page </p>
    </menu>
    <section class="index">
        <h1 class="admin-logo"> Online Examination System </h1>
        <div class="index-flex">
            <a href="admin_dashboard.html">
                <ion-icon class="icons" name="home-outline"></ion-icon>
            </a>
            <a href="Home.html" class="index-item">Home</a>
        </div>


       

        <div class="index-flex">
            <a href="UserLogin.html">
                <ion-icon class="icons" name="log-out-outline"></ion-icon>
            </a>
            <a href="UserLogin.html" class="index-item">Logout</a>
        </div>
    </section>
    <main>
        <div class="main_box">
            <h1 id="main-h1" class="heading-pri"> Hello ${sessionScope.na} </h1><br>
                <div calss="d1">
                    <h1 class="c1">Select your Quiz </h1>
                </div><br><br>
                <div>
                    <a href="JavaPper.html" class="heading-pri">Java Quiz</a><br><br>
                    <a href="paper2.html" class="heading-pri">Html Quiz</a>
                </div>
        </div>
    </main>
</body>

</html>