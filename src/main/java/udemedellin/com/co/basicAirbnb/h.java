/* usuario */

export const usuario = JSON.stringify({
        "id": any,
        "name": any,
        "coords": any
        });

        export function getAll(){
        const requestOptions = {
        method: "GET",
        redirect: "follow"
        };

        return fetch("http://18.208.152.26:8085/usuario/all", requestOptions)
        .then((response) => response.json());
        }

        export function getId(id){

        const requestOptions = {
        method: "GET",
        redirect: "follow"
        };

        return fetch("http://18.208.152.26:8085/usuario/"+id, requestOptions)
        .then((response) => response.json());

        }


        export function delet(id){

        const requestOptions = {
        method: "DELETE",
        redirect: "follow"
        };

        return fetch("http://18.208.152.26:8085/usuario/"+id, requestOptions)
        .then((response) => response.json());

        }

        export function save(objeto){
        const myHeaders = new Headers();
        myHeaders.append("Content-Type", "application/json");

        const requestOptions = {
        method: "POST",
        headers: myHeaders,
        body: objeto,
        redirect: "follow"
        };

        return fetch("http://18.208.152.26:8085/usuario", requestOptions)
        .then((response) => response.json());
        }