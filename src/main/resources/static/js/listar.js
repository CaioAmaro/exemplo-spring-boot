fetch('http://localhost:8080/produtos')
   .then(response => response.json())
   .then(listarProdutos => {
        const container = document.getElementById('container');

        listarProdutos.forEach(produto => {
            const card = document.createElement('div');
            card.innerHTML = `
            <h3>${produto.nomeProduto}</h3>
            <p>${produto.preco}</p>
            <p>${produto.id}</p>
            `;

            container.appendChild(card);
        })
   });

