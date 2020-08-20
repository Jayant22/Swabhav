var todos = new Array;

(function() {
  var todos_str = localStorage.getItem('todo');
    if (todos_str !== null) {
        todos = JSON.parse(todos_str); 
    }

  for (let index = 0; index < todos.length; index++) {
    var li = document.createElement("li");
    var inputValue = todos[index];
    var t = document.createTextNode(inputValue);
    li.appendChild(t);
    if (inputValue === '') {
    alert("You must write something!");
    }else {
      document.getElementById("myUL").appendChild(li);
    } 
  }
  
  for (i = 0; i < close.length; i++) {
    close[i].onclick = function(e) {
        
        var div = this.parentElement;
        div.style.display = "none";
        var str = todos[i];
        console.log(str);
        todos.splice(str, 1);
        localStorage.setItem('todo', JSON.stringify(todos));  
      }
    }
})();

// Create a "close" button and append it to each list item
var myNodelist = document.getElementsByTagName("LI");
var i;
for (i = 0; i < myNodelist.length; i++) {
  var span = document.createElement("SPAN");
  var txt = document.createTextNode("\u00D7");
  span.className = "close";
  span.appendChild(txt);
  myNodelist[i].appendChild(span);
}

// Click on a close button to hide the current list item
var close = document.getElementsByClassName("close");
var i;
console.log(close);
for (i = 0; i < close.length; i++) {
  close[i].onclick = function() {
  var div = this.parentElement;
  div.style.display = "none";
  }
}

// Add a "checked" symbol when clicking on a list item
var list = document.querySelector('ul');
list.addEventListener('click', function(ev) {
  if (ev.target.tagName === 'LI') {
  ev.target.classList.toggle('checked');
  }
}, false);

// Create a new list item when clicking on the "Add" button
function newElement() {

  var li = document.createElement("li");
  var inputValue = document.getElementById("myInput").value;
  var t = document.createTextNode(inputValue);
  li.appendChild(t);
  if (inputValue === '') {
  alert("You must write something!");
  } else {
    document.getElementById("myUL").appendChild(li);
    todos.push(inputValue);
    localStorage.setItem('todo', JSON.stringify(todos));
  }
  document.getElementById("myInput").value = "";
  var span = document.createElement("SPAN");
  var txt = document.createTextNode("\u00D7");
  span.className = "close";
  span.appendChild(txt);
  li.appendChild(span);
  
  for (i = 0; i < close.length; i++) {
    close[i].onclick = function(e) {
        
        var div = this.parentElement;
        div.style.display = "none";
        var str = todos[i];
        console.log(str);
        todos.splice(str, 1);
        localStorage.setItem('todo', JSON.stringify(todos));  
      }
    }
}

//Clearing the list
function removeAll(){
  var lst = document.getElementsByTagName("ul");
    lst[0].innerHTML = "";
}

