[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Registrace na letní dětský tábor</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
<form  action="/turnus" method="post">
    <h1>Registrace</h1>

    <label for="jmeno" >Jméno:</label>
    [@spring.formInput path="form.jmeno" /]
    <div class="error">[@spring.showErrors "<br>"/]</div>

    <label for="prijmeni" >Příjmení:</label>
    [@spring.formInput path="form.prijmeni" /]
    <div class="error">[@spring.showErrors "<br>"/]</div>

    <label for="datumNarozeni" >Datum narození:</label>
    [@spring.formInput path="form.datumNarozeni" /]
    <div class="error">[@spring.showErrors "<br>"/]</div>

    <label for="pohlavi" >Pohlaví:</label>
    [@spring.formSingleSelect path="form.pohlavi" options={
    "": "",
    "muž": "muž",
    "žena": "žena"
    } /]
    <div class="error">[@spring.showErrors "<br>"/]</div>

    <label for="turnus" >Turnus:</label>
    [@spring.formSingleSelect path="form.turnus" options={
    "": "",
    "5. až 11. července": "5. až 11. července",
    "12. až 18. července": "12. až 18. července",
    "19. až 25. července": "19. až 25. července"
    } /]
    <div class="error">[@spring.showErrors "<br>"/]</div>

    <label for="telefon" >Telefon na rodiče:</label>
    [@spring.formInput path="form.telefon" /]
    <div class="error">[@spring.showErrors "<br>"/]</div>

    <label for="email" >E-mail na rodiče:</label>
    [@spring.formInput path="form.email" fieldType="email" /]
    <div class="error">[@spring.showErrors "<br>"/]</div>

    <div class="radek controls">
        <button type="submit">Odeslat</button>
    </div>
</form>

</body>
</html>
