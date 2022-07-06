const formData = document.querySelector(".login-form");

formData.addEventListener("submit", handleDataSubmit);

function handleDataSubmit(event) {
    event.preventDefault();

    let user = {};

    const { elements: { email, password } } = event.currentTarget;

    if (email.value === "" || password.value === "") {
        return alert("Please fill in all the fields!");
    }

    user.email = email.value;
    user.pasword = password.value;

    console.log(user);

    event.currentTarget.reset();
}
