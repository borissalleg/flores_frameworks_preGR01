

    /*<![CDATA[*/
    document.addEventListener('DOMContentLoaded', function() {
        const message = document.getElementById('flashMessage');
        if (message) {
            // Mostrar el mensaje después de 1 segundo
            setTimeout(() => {
                message.style.opacity = '1';
            }, 500);

            // Ocultar el mensaje después de 4 segundos
            setTimeout(() => {
                message.style.opacity = '0';
                // Eliminar el elemento después de la animación
                setTimeout(() => message.remove(), 2000);
            }, 4000);
        }
    });
    /*]]>*/
