const textInput = document.querySelector('#name-input');
const textForInput = document.querySelector('#name-output');

textInput.addEventListener('input', () => {
    if(textInput.value !== "") {
        textForInput.innerText = textInput.value;
    } else {
        textForInput.innerText = "Anonymous";
    }
});