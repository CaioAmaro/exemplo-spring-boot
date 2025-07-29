const form = document.getElementById('formulario');
const alerta = document.getElementById('alerta');

form.addEventListener('submit', function(e) {
        e.preventDefault();

        
        const produto = {
            id: parseInt(document.getElementById('id').value),
            nomeProduto: document.getElementById('nome').value,
            preco: parseFloat(document.getElementById('preco').value)
        };

        

        fetch('http://localhost:8080/produtos', {
            method: 'PUT',
            headers: {'content-type': 'application/json'},
            body: JSON.stringify(produto)
        })

       // Mostrar o alerta
      alerta.classList.remove("d-none");

      // Limpar o formulário
      form.reset();

      // Ocultar o alerta após 3 segundos
      setTimeout(() => {
        alerta.classList.add("d-none");
      }, 2000);

    })