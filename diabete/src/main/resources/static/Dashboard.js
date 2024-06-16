document.addEventListener('DOMContentLoaded', (event) => {

    const dateElements = document.querySelectorAll('.glycemie-date');
    const valueElements = document.querySelectorAll('.glycemie-value');

    const labels = Array.from(dateElements).map(el => el.textContent.trim());
    const valeurGlycemie = Array.from(valueElements).map(el => parseFloat(el.textContent.trim()));




    let checked = false;
    const data = {
        labels: labels,
        datasets: [
            {
                label: 'Valeur Glycemie',
                data: valeurGlycemie,
                borderColor: 'rgb(255, 99, 132)',
                backgroundColor: 'rgba(255, 99, 132, 0.2)',
            }
        ]
    };
    let getting = localStorage.getItem("type") || "bar";
    const config = {
        type: getting,
        data: data,
        options: {
            responsive: true,
            maintainAspectRatio: false,
            plugins: {
                legend: {
                    position: 'top',
                },
                title: {
                    display: true,
                    text: 'Glycemie Levels Over Time'
                }
            }
        },
    };
    document.getElementById("change").addEventListener("click", () => {
        localStorage.clear();
        localStorage.setItem("type", "bar");
        checked = false;
        setTimeout(()=>{
            location.reload();
        },600)


    });

    document.getElementById("back").addEventListener("click", () => {

        localStorage.clear();
        localStorage.setItem("type" , "line");
        checked = true;
        setTimeout(()=>{
            location.reload();
        },600)

    });

    const ctx = document.getElementById('chart-1').getContext('2d');
    new Chart(ctx, config);
    function filterChart(date){
        const year=date.value.substring(0,4);
        console.log(year)
    }
});

    document.querySelectorAll(".containerOfResult").forEach(e => {
    const ArrayOfResult = ["Normale" , "Pas Normale"];
    const diabetAll = parseFloat(e.querySelector(".glycemie-value").textContent);
    const status = e.querySelector(".status");

    if (!isNaN(diabetAll)) {
    if (diabetAll < 1.4) {
    status.textContent = ArrayOfResult[0];
} else {
    status.textContent = ArrayOfResult[1];
    status.style.background= "red";
}}
});

    let list = document.querySelectorAll(".navigation li");

    function activeLink() {
    list.forEach((item) => {
        item.classList.remove("hovered");
    });
    this.classList.add("hovered");
}

    list.forEach((item) => item.addEventListener("mouseover", activeLink));

    // Menu Toggle
    let toggle = document.querySelector(".toggle");
    let navigation = document.querySelector(".navigation");
    let main = document.querySelector(".main");

    toggle.onclick = function () {
    navigation.classList.toggle("active");
    main.classList.toggle("active");
};

const ajouter = document.getElementById("ajouter");
const close = document.querySelector(".close");
const formWrapperAdd = document.querySelector(".formWrapperAdd");
let check = true;

ajouter.addEventListener("click" , ()=>{
        formWrapperAdd.style.display = "block"

})
close.addEventListener("click" , ()=>{
    formWrapperAdd.style.display = "none"
})