function test(){
    alert("funfou")
}

function OpenPopulate(){
    let back = document.getElementById(back);

    let op = document.createElement("shop-op") 
    let imgHolder = document.createElement("shop-image-holder") 
    let img = document.createElement("shop-image")
    //get image
    let nameHolder = document.createElement("shop-name-holder") 
    let name = document.createElement("shop-name") 
    //get name
    let type = document.createElement("shop-tipe") 
    //get type
    let nota = document.createElement("nota-x-x") 
    //get grade
    let ellip1 = document.createElement("ellipse-1") 
    let ellip2 = document.createElement("ellipse-2") 
    let offer = document.createElement("ofertas-e-novidades")
    //get offer 
    let description = document.createElement("description") 
    //get description
    let opClick = document.createElement("op-1-click") 
    opClick.onclick(test)
    
    /*<div class="shop-op"></div>
        <div class="shop-image-holder"></div>
        <div class="shop-image"></div>
        <div class="shop-name-holder"></div>
        <div class="shop-name">Nome muito grande</div>
        <div class="shop-tipe">Lanche</div>
        <div class="nota-x-x">Nota : x/x</div>
        <div class="ellipse-1"></div>
        <div class="ellipse-2"></div>
        <div class="ofertas-e-novidades">Ofertas e novidades :</div>
        <div class="description">Lanche legal, lanche mais ou menos legal</div>
        <div class="op-1-click" onclick="test()"></div>*/
    back.append(op, imgHolder, img, nameHolder, name, type, nota, ellip1, ellip2, offer, description, opClick);
}