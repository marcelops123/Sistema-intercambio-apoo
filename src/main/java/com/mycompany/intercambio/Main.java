package com.mycompany.intercambio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu Principal:");
            System.out.println("1. Usuário");
            System.out.println("2. Avaliação");
            System.out.println("3. Bolsa");
            System.out.println("4. Intercâmbio");
            System.out.println("5. Programa de Intercâmbio");
            System.out.println("6. Visto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Opções de Usuário:");
                    System.out.println("1. Autenticar Usuário");
                    System.out.println("2. Cadastrar Usuário");
                    System.out.println("0. Voltar");
                    System.out.print("Escolha uma opção: ");
                    int opcaoUsuario = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcaoUsuario) {
                        case 1:
                            System.out.print("Digite o ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Digite o email: ");
                            String email = scanner.nextLine();
                            Usuario usuario = new Usuario();
                            usuario.setId(id);
                            usuario.setEmail(email);
                            if (usuario.autenticar()) {
                                System.out.println("Usuário autenticado com sucesso.");
                            } else {
                                System.out.println("Falha na autenticação.");
                            }
                            break;
                        case 2:
                            Usuario novoUsuario = new Usuario();
                            System.out.print("Digite o ID: ");
                            novoUsuario.setId(scanner.nextInt());
                            scanner.nextLine();
                            System.out.print("Digite o nome: ");
                            novoUsuario.setNome(scanner.nextLine());
                            System.out.print("Digite o email: ");
                            novoUsuario.setEmail(scanner.nextLine());
                            System.out.print("Digite o telefone: ");
                            novoUsuario.setTelefone(scanner.nextLine());
                            if (novoUsuario.cadastrarUsuario()) {
                                System.out.println("Usuário cadastrado com sucesso.");
                            } else {
                                System.out.println("Falha no cadastro. ID ou email já existente.");
                            }
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 2:
                    System.out.println("Opções de Avaliação:");
                    System.out.println("1. Registrar Avaliação");
                    System.out.println("2. Consultar Avaliação");
                    System.out.println("0. Voltar");
                    System.out.print("Escolha uma opção: ");
                    int opcaoAvaliacao = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcaoAvaliacao) {
                        case 1:
                            Avaliacao avaliacao = new Avaliacao();
                            System.out.print("Digite o ID: ");
                            avaliacao.setId(scanner.nextInt());
                            scanner.nextLine();
                            System.out.print("Digite o comentário: ");
                            avaliacao.setComentario(scanner.nextLine());
                            System.out.print("Digite a nota: ");
                            avaliacao.setNota(scanner.nextFloat());
                            scanner.nextLine();
                            if (avaliacao.registrarAvaliacao(avaliacao.getId())) {
                                System.out.println("Avaliação registrada com sucesso.");
                            } else {
                                System.out.println("Falha ao registrar avaliação. ID já existe.");
                            }
                            break;
                        case 2:
                            System.out.print("Digite o ID da Avaliação: ");
                            int idAvaliacao = scanner.nextInt();
                            scanner.nextLine();
                            Avaliacao consultaAvaliacao = new Avaliacao();
                            System.out.println(consultaAvaliacao.consultarAvaliacao(idAvaliacao));
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 3:
                    System.out.println("Opções de Bolsa:");
                    System.out.println("1. Alocar Bolsa");
                    System.out.println("2. Consultar Valor da Bolsa");
                    System.out.println("0. Voltar");
                    System.out.print("Escolha uma opção: ");
                    int opcaoBolsa = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcaoBolsa) {
                        case 1:
                            Bolsa bolsa = new Bolsa();
                            System.out.print("Digite o ID da Bolsa: ");
                            bolsa.setId(scanner.nextInt());
                            scanner.nextLine();
                            System.out.print("Digite a descrição: ");
                            bolsa.setDescricao(scanner.nextLine());
                            System.out.print("Digite o valor: ");
                            bolsa.setValor(scanner.nextFloat());
                            scanner.nextLine();
                            System.out.print("Digite o tipo: ");
                            bolsa.setTipo(scanner.nextLine());
                            if (bolsa.alocarBolsa(new UsuarioIntercambio())) {
                                System.out.println("Bolsa alocada com sucesso.");
                            } else {
                                System.out.println("Falha ao alocar bolsa. ID já existe.");
                            }
                            break;
                        case 2:
                            System.out.print("Digite o ID da Bolsa: ");
                            int idBolsa = scanner.nextInt();
                            scanner.nextLine();
                            Bolsa consultaBolsa = new Bolsa();
                            consultaBolsa.setId(idBolsa);
                            System.out.println("Valor da Bolsa: " + consultaBolsa.consultarValor());
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 4:
                    System.out.println("Opções de Intercâmbio:");
                    System.out.println("1. Inscrever Participante");
                    System.out.println("2. Alterar Status");
                    System.out.println("3. Gerar Relatório");
                    System.out.println("0. Voltar");
                    System.out.print("Escolha uma opção: ");
                    int opcaoIntercambio = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcaoIntercambio) {
                        case 1:
                            Intercambio intercambio = new Intercambio();
                            System.out.print("Digite o ID do Participante: ");
                            UsuarioIntercambio participante = new UsuarioIntercambio();
                            participante.setId(scanner.nextInt());
                            scanner.nextLine();
                            intercambio.inscreverParticipante(participante);
                            System.out.println("Participante inscrito com sucesso.");
                            break;
                        case 2:
                            System.out.print("Digite o novo status: ");
                            Intercambio alteracaoStatus = new Intercambio();
                            alteracaoStatus.alterarStatus(scanner.nextLine());
                            System.out.println("Status alterado com sucesso.");
                            break;
                        case 3:
                            Intercambio relatorioIntercambio = new Intercambio();
                            System.out.println(relatorioIntercambio.gerarRelatorio());
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 5:
                    System.out.println("Opções de Programa de Intercâmbio:");
                    System.out.println("1. Inscrever Participante");
                    System.out.println("2. Alterar Status");
                    System.out.println("3. Gerar Relatório");
                    System.out.println("0. Voltar");
                    System.out.print("Escolha uma opção: ");
                    int opcaoPrograma = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcaoPrograma) {
                        case 1:
                            ProgramaIntercambio programa = new ProgramaIntercambio();
                            System.out.print("Digite o ID do Participante: ");
                            UsuarioIntercambio participantePrograma = new UsuarioIntercambio();
                            participantePrograma.setId(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println(programa.inscreverParticipante(participantePrograma));
                            break;
                        case 2:
                            System.out.print("Digite o novo status: ");
                            ProgramaIntercambio alteracaoStatusPrograma = new ProgramaIntercambio();
                            alteracaoStatusPrograma.alterarStatus(scanner.nextLine());
                            System.out.println("Status alterado com sucesso.");
                            break;
                        case 3:
                            ProgramaIntercambio relatorioPrograma = new ProgramaIntercambio();
                            System.out.println(relatorioPrograma.gerarRelatorio());
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 6:
                    System.out.println("Opções de Visto:");
                    System.out.println("1. Atualizar Status");
                    System.out.println("2. Consultar Status");
                    System.out.println("0. Voltar");
                    System.out.print("Escolha uma opção: ");
                    int opcaoVisto = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcaoVisto) {
                        case 1:
                            Visto visto = new Visto();
                            System.out.print("Digite o ID do Visto: ");
                            visto.setId(scanner.nextInt());
                            scanner.nextLine();
                            System.out.print("Digite o status do visto: ");
                            visto.setStatus(scanner.nextLine());
                            UsuarioIntercambio usuarioVisto = new UsuarioIntercambio();
                            usuarioVisto.setStatusVisto(visto.getStatus());
                            if (visto.atualizarStatus(usuarioVisto)) {
                                System.out.println("Status do visto atualizado com sucesso.");
                            } else {
                                System.out.println("Falha ao atualizar status do visto.");
                            }
                            break;
                        case 2:
                            System.out.print("Digite o ID do Visto: ");
                            int idVisto = scanner.nextInt();
                            scanner.nextLine();
                            Visto consultaVisto = new Visto();
                            consultaVisto.setId(idVisto);
                            System.out.println("Status do Visto: " + consultaVisto.consultarStatus());
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
