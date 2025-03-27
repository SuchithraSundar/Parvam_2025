const document_root = document.getRootNode(); // Root node (Window)
console.log(document_root.childNodes); // Logs [<!DOCTYPE html>, html]

const html_tag = document_root.childNodes[1]; // Selecting <html> tag
console.log(html_tag); // Logs <html>...</html>
console.log(html_tag.childNodes); // Logs [head, text, body]

const body_tag = html_tag.childNodes[2]; // Selecting <body> tag (index 2, since index 1 is whitespace)
console.log(body_tag); // Logs <body>...</body>

const h1_tag = body_tag.querySelector("h1"); // Selecting <h1> tag
h1_tag.addEventListener("click", function () {
    body_tag.style.backgroundColor = "lightblue"; // Change background color
});
