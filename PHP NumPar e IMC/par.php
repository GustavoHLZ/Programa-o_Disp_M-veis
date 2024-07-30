<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
        <?php
        if(isset($_GET["numero"])) {

            $result="ímpar";
         if(intval($_GET["numero"])%2==0){
            $result="par";
         }   
        
        ?>
        <h2>       <?php  echo $result; ?>  </h2>

        <?php
        }
        ?>
    
</body>
</html>