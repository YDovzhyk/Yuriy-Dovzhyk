let counterValue = 0;

let content = document.querySelector("#counter");
const firstBtn = content.firstElementChild;
const secondBtn = content.lastElementChild;
const counterResult = document.querySelector("#value");
// console.log(firstBtn);
// console.log(secondBtn);

firstBtn.addEventListener('click', () => {
    counterValue -= 1;
    counterResult.innerText = counterValue;
});

secondBtn.addEventListener('click', () => {
    counterValue += 1;
    counterResult.innerText = counterValue;
});

