<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>  Resultado IMC</h2>
    <?php
        if(isset($_GET['peso']) && isset($_GET['altura']) && $_GET['altura']!=0){
        $peso=$_GET['peso'];
        $altura=$_GET['altura'];
        $imc=$peso/($altura*$altura);
        }
    ?>
    <span> peso: </span> <span> <?php echo $peso; ?> </span><br>
    <span> altura: </span> <span> <?php echo $altura; ?> </span><br>
    <span> imc: </span> <span> <?php echo $imc; ?> </span><br>
</body>
</html>
