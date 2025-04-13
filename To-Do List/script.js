let inputBox = document.getElementById("input-Box")
let listContainer = document.querySelector(".list-Container")

function addTask (){
    if(inputBox.value == ""){
        console.log("You must write something!")
    }
    else{
        let li = document.createElement("li")
        li.innerHTML = inputBox.value
        listContainer.appendChild(li); 
        let span = document.createElement("span")
        span.innerHTML = "\u00d7";
        li.appendChild(span)
        .addEventListener("click", remove);
        function remove(){
                li.remove()
            }
        }
        inputBox.value = "";
        savenote()
}

listContainer.addEventListener("click", function (e) {
    if(e.target.tagName === "LI"){
        e.target.classList.toggle("checked");
        savenote()
    }
    else if(e.target.tagName === "SPAN"){
        e.target.parentElement.remove()
        savenote()
    }
},false);

function savenote() {
    localStorage.setItem("note", listContainer.innerHTML)
}
function showTask(){
    listContainer.innerHTML = localStorage.getItem("note")
}
showTask()
