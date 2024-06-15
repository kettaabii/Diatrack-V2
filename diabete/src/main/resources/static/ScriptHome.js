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