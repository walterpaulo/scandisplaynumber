# Scan Display Number

A máquina escaneia os papéis e produz um arquivo com um conjunto de entradas na seguinte forma:

```
    _  _     _  _  _  _  _
 |  _| _||_||_ |_   ||_||_|
 | |_  _|  | _||_|  ||_| _|

```

**Display:**
* 4 linhas;
* cada linha com 27 caracteres;
* as 3 linhas contêm um número de conta, formado por pipes "|" e underscores "_";
* 4° linha com espaço vazio;
* conta deve possuir 9 dígitos de 0 a 9;
* possui cerca de 500 entradas.



### 1° Requisito
- --
O programa recebe um arquivo de entrada e devolve conta com nove números com algarismos de 0 a 9.

**Entrada:**
```
    _  _     _  _  _  _  _
 |  _| _||_||_ |_   ||_||_|
 | |_  _|  | _||_|  ||_| _|

```
**Saída:**
```
 123456789
```

### 2° Requisito
- --
_O programa deve validar os números de conta, segue regras:_

``` 
  Número de conta:     9   9   3   4   4   7   6   7   4  
  Nomes das posições:  d9  d8  d7  d6  d5  d4  d3  d2  d1
  
  Verificação do número de conta:
  (d1 + 2*d2 + 3*d3 + 4*d4 + ... + 9*d9) mod 11 = 0
```  

### 3° Requisito
O arquivo de saída possui um número de conta por linha.
Se algum caractere está ilegível, ele é substituído por "?" e uma segunda coluna
indica o tipo de erro (Tabela de erros).

**Entrada:**
```
   _  _  _        _  _  _    
  |_||_| _||_||_|  ||_   ||_|
   _| _| _|  |  |  ||_|  |  |
                             
```
**Saída:**
```
 993447674 ERR
```


Tabela de erros

 | TIPO | DESCRIÇÃO|
 |------|-------------------|
 | ERR | números inválidos |
 | ILL  |números com dígitos ilegíveis|
### Exemplos de casos de teste:


### Teste 1:
- --
**Entrada:**
```
 _  _  _  _  _  _  _  _  _ 
| || || || || || || || || |
|_||_||_||_||_||_||_||_||_|
                             
```
**Saída:**

```
 000000000
```


### Teste 2:
- --
**Entrada:**
```
    _  _     _  _  _  _  _
  | _| _||_||_ |_   ||_||_|
  ||_  _|  | _||_|  ||_| _|
                             
```
**Saída:**
```
 123456789
```

### Teste 3:
- --
**Entrada:**
```
 _  _  _  _  _  _  _  _    
| || || || || || || ||_   |
|_||_||_||_||_||_||_| _|  |
                             
```
**Saída:**
```
 000000051
```

### Teste 4:
- --
**Entrada:**
```
    _  _     _  _  _  _  _ 
  | _| _||_| _ |_   ||_||_|
  ||_  _|  | _||_|  ||_| _ 
                             
```
**Saída:**
```
 1234?678? ILL
```

### Teste 5:
- --
**Entrada:**
```
                    
|_||_||_||_||_||_||_||_||_|
  |  |  |  |  |  |  |  |  |
                          
```
**Saída:**
```
444444444 ERR
```


