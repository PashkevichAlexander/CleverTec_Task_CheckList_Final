<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>ConsoleShop</title></head>
<body>
<div class="mx-auto" style="width: 400px;">
    <h1>ConsoleShop</h1>
    <h2>AddOrder</h2>
</div>
<div class="mx-auto" style="width: 500px;">
    <form method="post" action="/add">
        <div class="container">
            <div class="row">
                <div class="col-sm">Item Id:</div>
                <div class="col-sm">quantity:</div>
            </div>
            <form method="get" action="/menu">
                <div class="row">
                    <div class="col-sm"><input type="text" name="itemId"></div>
                    <div class="col-sm"><input type="text" name="quantity"></div>

                </div>
                <p><input type="submit" value="AddOrder"></p>
            </form>
        </div>
        <form method="get" action="/menu">
            <p><input type="submit" value="Menu"></p>
        </form>
    </form>

</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
