const form = document.getElementById('form');
const alerta = document.getElementById('alerta');

form.addEventListener('submit', function(e) {
    e.preventDefault();

    fetch('http://localhost:8080/produtos/' + document.getElementById('id').value, {
            method: 'DELETE',
            headers: {'content-type': 'application/json'},
        })
        .then(response => {
            if(response.ok) {
                alertSucess();
            }else{
                alert("Erro ao deletar o produto. Verifique se o ID está correto.");
            }
        })
})

function alertSucess(){

     alerta.innerHTML = "Produto deletado com sucesso!";
     alerta.classList.remove("alert-sucess");

    // Mostrar o alerta
      alerta.classList.remove("d-none");

      // Limpar o formulário
      form.reset();

      // Ocultar o alerta após 3 segundos
      setTimeout(() => {
        alerta.classList.add("d-none");
      }, 2000);
}