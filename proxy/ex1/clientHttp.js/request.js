// request.js
import axios from 'axios';

// URL da sua API Spring (ajuste para seu Codespace ou localhost)
const SPRING_API_URL = 'http://localhost:8081/api';

// Corpo da requisição
const payload = {
  professor: "João da Silva",
  classNumber: 123
};

// Função principal
async function main() {
  try {
    const response = await axios.post(SPRING_API_URL, payload);
    console.log("✅ Resposta da API:");
    console.log(response.data);
  } catch (error) {
    console.error("❌ Erro ao fazer requisição:");
    console.error(error.message);
    if (error.response) {
      console.error("Detalhes da resposta com erro:", error.response.data);
    }
  }
}

main();