//console.log("hello");
// console.log(document.getRootNode());//it will give document as html structure
// console.dir(document.getRootNode());//it will give document as object

const document_root = document.getRootNode();//gives rootnode as window
console.log(document_root.childNodes);// gives childnodes as [<!DOCTYPE html>, html]

const html_tag = document_root.childNodes[1]
console.log(html_tag);//html
console.log(html_tag.childNodes);//it will returns the child present inside html_tag as [head,text,body]

const head_tag = html_tag.childNodes[0];
console.log(head_tag.childNodes);//it will returns the child including space(text) present inside head_tag as  [text, title, text, script] which 
console.log(head_tag.children);//it will returns the child excluding space(text) present inside head_tag as  [title,, script] -which is HTML collection

const title_tag = head_tag.children[0];
console.log(title_tag.innerText);//it will return the text inside title by using innerText 
console.log(title_tag.textContent);//it will return the text inside title by using text Content
console.log(title_tag.innerHTML);//it will return the text inside title by using innerHTML 
console.log(title_tag.parentNode);// it will return the parent node of title that is <head></head> tag
console.log(title_tag.nextSibling);//it will return sibling of title that is #text
console.log(title_tag.nextElementSibling);//it will return sibling element of title that is script


//const body_tag =html_tag1.childNodes[2];//it is not working
// console.log(body_tag.childNodes);
const body_tag = document.body;//it will return body content
console.log(body_tag);
console.log(body_tag.childNodes);//it will returns the child including space(text) present inside body 
console.log(body_tag.children);//it will returns the child excluding space(text) present inside body 


//div tag of body
const div_tag = body_tag.children[0];
console.log(div_tag);
console.log(div_tag.children);//it will returns the child excluding space(text) present inside div tag
console.log(div_tag.children[0]);// div first child (h1)
console.log(div_tag.children[0].innerText);//it will return the text inside div tag first child(h1) by using innerText 

console.log(div_tag.children[1]);// div second child (p)
console.log(div_tag.children[1].innerText);//it will return the text inside div tag second child(p) by using innerText 

//script tag of body
const div_tag1 = body_tag.children[1];
console.log(div_tag1);
console.log(div_tag1.innerText);

