const categoryNum = document.querySelectorAll('.item');
console.log("Number of categories: " + categoryNum.length);

for (let i = 0; i < categoryNum.length; i++) {
    const categoryName = document.querySelectorAll('h2');
    console.log("Category: " + categoryName[i].textContent);

    const elementUl = categoryNum[i].lastElementChild;
    // console.log(elementUl);

    const element = elementUl.querySelectorAll('li');
    console.log("Elements: " + element.length);
}


