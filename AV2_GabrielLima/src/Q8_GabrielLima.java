public class Q8_GabrielLima extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private static final int NUM_MAXIMO = 20;
    private static final int NUM_TENTATIVAS = 5;

    private Random gerador;
    private int numeroSorteado;
    private int tentativaAtual;
    private JLabel mensagem;
    private JTextField campoTentativa;
    private JButton[] botoesNumeros;

    public AdivinharNumero() {
        super("Adivinhar Número");

        gerador = new Random();
        numeroSorteado = gerador.nextInt(NUM_MAXIMO) + 1;
        tentativaAtual = 1;

        JPanel painel = new JPanel(new FlowLayout());
        botoesNumeros = new JButton[NUM_MAXIMO];
        for (int i = 0; i < NUM_MAXIMO; i++) {
            botoesNumeros[i] = new JButton(String.valueOf(i + 1));
            botoesNumeros[i].addActionListener(this);
            painel.add(botoesNumeros[i]);
        }
        add(painel);

        mensagem = new JLabel("");
        add(mensagem);

        campoTentativa = new JTextField(2);
        campoTentativa.setEditable(false);
        campoTentativa.setText("1");
        add(campoTentativa);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botaoClicado = (JButton) e.getSource();
        int numeroEscolhido = Integer.parseInt(botaoClicado.getText());

        if (numeroEscolhido == numeroSorteado) {
            mensagem.setText("Você acertou o número!");
            desabilitarBotoes();
        } else {
        	mensagem.setText("Tente novamente");
            tentativaAtual++;
            campoTentativa.setText(String.valueOf(tentativaAtual));

            if (tentativaAtual > NUM_TENTATIVAS) {
                mensagem.setText("Você não conseguiu acertar o número! O número sorteado foi " + numeroSorteado);
                desabilitarBotoes();
            }
        }
    }

    private void desabilitarBotoes() {
        for (JButton botao : botoesNumeros) {
            botao.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        new AdivinharNumero();
        }
    }
}
