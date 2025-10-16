//Data-Hora-Local: sem fuso horário, não interessa a pessoas de outro fuso horario;
//Data-Hora-Global com fuso horário, interessa o fuso horario;

/*
Timezone:
- GMT: Horário de Londres (padrão)
- São Paulo: GMT-3
 */
/*
COMO REPRESENTAR EM TEXTO:
    Data-[hora] local:
        2022-07-21
        2022-07-21T14:52
        2022-07-21T14:52:09
        2022-07-21T14:52:09.4073
    Data-hora global:
        2022-07-21T14:52:09Z (ZULU TIME)
        2022-07-21T14:52:09-03:00
 */
/*
OPERAÇÕES IMPORTANTES:

INSTANCIAÇÃO:
    -(agora)-> Data-hora
    -Texto ISO 8601 -> Data-hora
    -Texto formato customizado -> Data-hora
    -dia, mês, ano, [horário] -> Data-hora local
FORMATAÇÃO:
    -Data-hora-> Texto ISO 8601
    -Data-hora-> Texto formatado customizado
 */
