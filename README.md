# Trabalho2-AED2-


=======================================================================================
→ O trabalho deverá ser feito individual.
→ Não poderá utilizar frameworks.
→ Não é permitido utilizar Java Collections Framework.
→ Trabalhos entregue em atraso serão aceitos, todavia a nota atribuída ao trabalho será zero.
→ Clareza, identação e comentários no programa são obrigatórios e vão valer pontos.
> Se o professor achar necessário, poderá agendar uma arguição para avaliar o raciocínio utilizado na
construção do código-fonte e entendimento deste.
→ Projetos copiados (e códigos-fonte) terão nota zero.
→ Evite discussões inócuas com o professor em tentar postergar a data de entrega do referido
trabalho.
→ O projeto deve ser enviado via GitLab de acordo com o ID da turma:
→ https://gitlab.com/ucl_si/aed-2/2020-1/trabalhos/id96/t2
→ https://gitlab.com/ucl_si/aed-2/2020-1/trabalhos/id179/t2
> NomeSobrenome
=======================================================================================

CENÁRIO ÚNICO

PitStop, evento criado pelos cursos (Análise e Desenvolvimento de Sistemas – ADS) e (Sistemas
de Informação – SI) da Faculdade UCL, tem como finalidade fazer uma parada técnica durante
o 1o semestre para apresentar palestras sobre algum tema relacionado a área de tecnologia. A
edição de 2020 irá repetir a principal novidade da edição 2019: um cinema que passará cenas
de filmes sobre tecnologias (cinema de tecnologia da informação – CTI → 5 salas disponíveis).
O CTI está oferendo entradas grátis para qualquer uma de suas 5 salas, que estão passando 5
conjuntos de cenas de filmes diferentes. Diversas pessoas estão formando uma fila para
conseguir os ingressos gratuitos. Porém, não é possível escolher quais conjuntos de cenas de
filmes assistir: o moço da bilheteria – BilúBilú (veio de outro planeta para trabalhar apenas
neste evento), tem uma pilha de ingressos embaralhados e ele simplesmente entrega o
ingresso do topo da pilha para quem está na frente da fila. Em troca do ingresso, BilúBilú obtém
dados pessoais dos agraciados.
BilúBilú insere em uma lista: o nome (obrigatório) de quem ganhou o ingresso, qual sala será
direcionado(a) o(a) agraciado(a), o número do telefone celular (opcional) e o e-mail
(obrigatório).
=======================================================================================

Comece a fazer este trabalho logo !

=======================================================================================
Desenvolva um sistema utilizando a linguagem de programação Java que implementa o
CENÁRIO ÚNICO, inclusive os TADs lista, pilha e fila. Se a implementação da fila for em vetor, a
da pilha deve ser por referência ou vice-versa.
• O evento tem até o momento: 80 inscritos
o A quantidade de pessoas por sala pode variar entre 10 e 15 pessoas.
• Cada dupla pode escolher a implementação do TAD lista que julgar mais conveniente.
• Todas as operações (dos TADs) vistas em laboratório devem obrigatoriamente estar
presentes no sistema.
Execute testes exaustivos, mostrando que seu sistema funciona nas mais diversas situações
(exemplos: pilha vazia, fila cheia, etc.). Para testar, encha a fila com pessoas. Para preencher a
pilha, escolha 5 códigos (ordem que eles aparecem na pilha é aleatória) de salas. A pilha pode
ter mais de 5 ingressos. O sistema deve ter uma opção para imprimir a lista de agraciados,
mostrando os dados de quem ganhou qual ingresso. Para as três estruturas você deve
implementar métodos que permitam ao usuário listar a estrutura em tela a qualquer momento.
=======================================================================================

IMPOSIÇÃO
• Seu sistema deverá criar logs de execução:
→ Visualizar um exemplo na ESO (LogExemplo.txt) (Figura ):

Figura 1: exemplo de log de execução.

→ É permitido gerar um ou vários logs de execução dentro do próprio pacote do sistema raiz,
que demonstre a execução correta dos processos (referente aos testes):
– Caso existam vários, deve-se numerar os logs usando o padrão de nomenclatura:
log<codigo>.txt
exemplo: log1.txt, log2.txt, log3.txt ... , log560769.txt
– Os logs devem ser criados de maneira clara e objetiva.
• Os testes devem ser exaustivos até o ponto que demonstrem com clareza a funcionalidade
correta do sistema.
=======================================================================================