const userInput = document.querySelector('input');
// console.log(userInput.getAttribute("data-length"));

userInput.addEventListener('blur', () => {
    if (userInput.value.length === Number(userInput.getAttribute("data-length"))) {
        userInput.classList.remove("invalid");
        userInput.classList.add("valid");
        // console.log(userInput);
    } 

    if (userInput.value === "") {
        userInput.classList.remove("invalid");
        userInput.classList.remove("valid");
        // console.log(userInput);

    } else if (userInput.value.length < userInput.getAttribute("data-length") || 
               userInput.value.length > userInput.getAttribute("data-length")) {
        userInput.classList.remove("valid");
        userInput.classList.add("invalid");
        // console.log(userInput);
    }
});