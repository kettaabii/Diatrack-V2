function generatePDF() {
    const element = document.querySelector('.piece');
    html2pdf().from(element).save();
}