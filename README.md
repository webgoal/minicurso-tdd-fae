### Mini-curso de TDD

http://dontpad.com/minicursotdd

http://dontpad.com/minicursotdd.slides

Códigos feitos no mini-curso:

https://github.com/webgoal/minicurso-tdd-fae/tree/master/Forca/src/forca

Código que atende todos os requisitos estão na branch completo:

https://github.com/webgoal/minicurso-tdd-fae/tree/completo/Forca/src/forca


### Test Driven Development (TDD)

#### eXtreme Programming

A XP é um conjunto de valores e práticas que ajudam na criação de um time ágil

XP não é um processo, entenda como as regras de um jogo

XP também pode ser considerada um estado de transição, te ajuda a criar os hábitos corretos e aprender como trabalhar de maneira ágil

Uma pessoa muito boa consegue ser 10 vezes melhor que a média. Uma equipe muito boa consegue ser até 800 vezes melhor que a média

#### Prática: Programação em Par

Aumenta qualidade sem impactar no tempo de entrega

Aumenta o foco

Propriedade coletiva do código

Estabelece uma relação de confiança e cooperação entre as pessoas

Não é: Mentoring. A relação professor / aprendiz é diferente

É uma skill social, leva tempo e requer prática para funcionar bem

#### Prática: Ritmo sustentável

Cada iteração deve entregar o máximo de valor possível

No fim da iteração, é mais importante terminar um único item do que ter vários iniciados

Horas extras de trabalho sugam o espírito e motivação da equipe, resultando em menos trabalho feito

Faça planos realísticos

O importante é entender a motivação da prática!

#### Problema: Jogo da forca

- Requisito #1: Ao informar uma letra, deve responder contém ou não contém;
- Requisito #2: Deve exibir a palavra sendo revelada ( _ _ _ )
- Requisito #3: Deve validar se o jogador ganhou
- Requisito #4: Deve validar se o jogador perdeu
- Requisito #5: Informar palavra no início

#### Início da prática

- Setup: Ler input do usuário e exibir valor inserido
- Implementar Requisito #1: Ao informar uma letra, deve responder contém ou não contém
- Qual o tempo gasto para ter para feedback?
- Criar software que testa nosso software!
- Prática: Feedback rápido
- JUnit
- Implementar Requisito #2: Deve exibir a palavra sendo revelada ( _ _ _ )
- Implementar Requisito #3: Deve validar se o jogador ganhou
- Prática: Refatoração
- Prática: Teste primeiro
- Implementar Requisito #4: Deve validar se o jogador perdeu
- Prática: Nunca adicione funcionalidades prematuramente
- Prática: Simplicidade
- Implementar Requisito #5: Informar palavra no início
- Fail -> Pass -> Refactor
