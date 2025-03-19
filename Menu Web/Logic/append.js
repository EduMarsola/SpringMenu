function AppendItem(){
    let box = document.createElement("h1")
    let res = fetch("http://localhost:8080/food/all", "no-cors")
    box.innerHTML = "eridograma"
    document.body.append(box)
}