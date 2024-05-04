```mermaid
classDiagram
    direction LR

    class AP{
      -radios: ArrayList<Radio>
    }

    class Radio{
        -int Frequência
        -int Potência
        -string Canal de Operação
    }
    AP *-text- Radio
```
