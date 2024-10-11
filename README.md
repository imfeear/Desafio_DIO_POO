# Sistema de Gestão de Tarefas com JavaFX e MongoDB

Este projeto é uma aplicação de gerenciamento de tarefas desenvolvida em Java, usando a biblioteca JavaFX para a interface gráfica e MongoDB como banco de dados para armazenar as informações. Ele permite que os usuários façam login, cadastrem novas contas, gerenciem categorias e tarefas, e vejam tarefas organizadas por categorias.

## Funcionalidades Principais
- **Login e Cadastro:** Permite que os usuários façam login ou se registrem.
- **Gerenciamento de Categorias:** Adicionar, editar, excluir e visualizar categorias.
- **Gerenciamento de Tarefas:** Adicionar, editar, excluir, marcar como concluídas e visualizar tarefas.
- **Visualizar Tarefas por Categoria:** Permite visualizar as tarefas associadas a cada categoria específica.
- **Alertas de Interface:** Feedback visual para várias ações, como adicionar ou excluir tarefas e categorias, ou quando já estiver logado.

## Pré-requisitos
- **Java Development Kit (JDK)**: Versão 8 ou superior.
- **JavaFX**: Para a interface gráfica.
- **MongoDB**: Um servidor de MongoDB local ou hospedado na nuvem (MongoDB Atlas é recomendado).
- **Internet**: Necessário se estiver usando MongoDB Atlas para a conexão de banco de dados.

## Como Configurar o Projeto

### Instalação do JavaFX
1. **Baixe o JavaFX SDK**:
   - Acesse o site oficial do [Gluon JavaFX](https://gluonhq.com/products/javafx/) e faça o download do JavaFX SDK compatível com seu sistema operacional.

2. **Configure JavaFX no seu Projeto**:
   - Extraia o conteúdo do arquivo baixado.
   - Em sua IDE (como IntelliJ IDEA), vá até as configurações do projeto.
   - Adicione o caminho do JavaFX SDK aos módulos do projeto:
     ```
     VM Options: --module-path /caminho/para/javafx/lib --add-modules javafx.controls,javafx.fxml
     ```
   - Substitua `/caminho/para/javafx/lib` pelo caminho real da pasta `lib` no JavaFX SDK.

3. **Adicionando JavaFX ao Maven** (opcional):
   Se você estiver usando Maven, adicione as dependências JavaFX ao seu `pom.xml`:
   ```xml
   <dependency>
       <groupId>org.openjfx</groupId>
       <artifactId>javafx-controls</artifactId>
       <version>17.0.1</version>
   </dependency>
   <dependency>
       <groupId>org.openjfx</groupId>
       <artifactId>javafx-fxml</artifactId>
       <version>17.0.1</version>
   </dependency>
