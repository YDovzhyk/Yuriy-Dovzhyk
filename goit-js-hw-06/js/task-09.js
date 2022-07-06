function getRandomHexColor() {
  return `#${Math.floor(Math.random() * 16777215).toString(16)}`;
}

const bodyEl = document.querySelector("body");
const btnChengeColor = document.querySelector("button");
const textColor = document.querySelector("span");

console.log(bodyEl);
console.log(btnChengeColor);
console.log(textColor);

btnChengeColor.addEventListener("click", onButtonChengeColorClick);

function onButtonChengeColorClick(event) {
  const color = getRandomHexColor();
  textColor.textContent = color;
  bodyEl.style.backgroundColor = color;
}




