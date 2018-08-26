package com.websistems.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listaSignos;
    private String[] signos = {"Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sargitário", "Capricórnio", "Aquário", "Peixes"};
    private String[] perfis = {
            "Áries simboliza o começo de tudo. É o signo dos inícios, que projeta no tempo presente, com sua enorme pulsação de vida, a idéia ou o desejo. Áries simboliza o momento do nascimento e a luta pela vida. É lutando que se conquista algo e Áries gosta de uma boa briga, em que possa concentrar toda a sua fé e sua mente.",
            "Touro tem a função de estabilizar as conquistas e os caminhos abertos por Áries, e por isso mantém os pés bem firmes na terra, agüentando com paciência o que muitos outros abandonam pela metade.",
            "A função básica de Gêmeos é disseminar e difundir o que Touro criou e consolidou a partir do impulso de Áries. O movimento da criação de algo passa sempre, no Zodíaco, por um processo trifásico, ou seja: um signo manifesta um impulso, em seguida outro a estabiliza e concentra e em seguida um outro a distribui, dissemina para que outro processo tenha início.",
            "Em Câncer, é preciso digerir tudo o que foi feito anteriormente, assentar a criação em uma base firme, integrá-la no ambiente coletivo em que todos vivem para que ela possa ser incorporada, e também deixar suas sementes para um futuro que não se conhece ainda. E exatamente isso é que Câncer faz e assim irá agir na vida: interiorizando o que vive, assentando em sua vida o que aprendeu, criando um apoio para as pessoas que considera iguais – e daí criando o conceito de uma família, ou tribo – onde irá gestar e nutrir, acalentando sonhos, o futuro de toda a coletividade.",
            "Leão tem como função básica a fixação da germinação que ocorreu no escuro silencioso e protegido de Câncer, o signo anterior. Leão significa o momento em que os primeiros frutos dão rebentos, uma vez que a semente foi bem plantada. O produto é bom e forte se a semente recebeu o ambiente propício para se fortalecer. Signo fixo, Leão simboliza a força da criação, os primeiros resultados que irrompem, a despeito de todas as dificuldades. Daí a analogia do signo com o desafio e com a auto-afirmação.",
            "Virgem assinala aquele momento em que o homem, depois de provar seu valor, sua capacidade e seu poder em Leão, percebe que é preciso colocar tudo isso às ordens de um sistema maior, pois vive em comunidade. E mais: que ainda é necessário aprimorar-se, aperfeiçoar o que criou, aceitando humildemente que não sabe nem pode tudo e que faz parte de um organismo maior.",
            "Libra marca a fronteira entre o mundo individual e particular – que começa em Áries e termina em Virgem – e o início da vida na coletividade, a socialização, o momento em que, após ter se aprimorado, organizado o ritmo da vida, começa a troca com a comunidade maior em que vive.",
            "Chega a vez de mais um signo de estabilidade e fixação, desta vez voltado para o relacionamento e seus produtos: o filho, as posses em comum, a criatividade.",
            "Sagitário tem a função de espalhar e acomodar, adaptando as descobertas feitas em Escorpião a um mundo mais amplo, onde a força aglutinada possa ser posta a serviço de uma inspiração, de um rumo social maior.",
            "Capricórnio inaugura uma estação – o verão no hemisfério sul e o inverno no hemisfério norte. Cardinal, portanto movimentador, senhor do tempo e dos grandes projetos, surge o capricórnio, cujo maior objetivo é a construção de algo que almeje o bem maior.",
            "Depois de ter construído algo na sociedade, chega a vez de consolidar o conhecimento de tudo o que foi construído para um grande número de pessoas. E assim chegamos, outra vez, ao último signo fixo da seqüência zodiacal, o Aquário, cuja função é encontrar os meios mais racionais para que a maior quantidade possível de pessoas possa, igualmente, usufruir de tudo o que foi criado no Capricórnio.",
            "Peixes também é o último da série dos signos mutáveis, aquele que dispersa e distribui tudo o que todos os signos anteriores construíram e criaram no ciclo de manifestação. Assim como ele se dedica ao entendimento geral de tudo, porque sabe que tudo tem um fim, também sabe que está na fronteira de dois mundos. Um mundo que termina, outro que deve começar dentro em pouco. Nesse limiar, Peixes permanece, sentindo e pressentindo o que ainda virá, e o que já foi, tentando ensinar ao mundo a lição de todos somos partes de um mesmo organismo, que não há separação."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, signos);

        listaSignos.setAdapter(adapter);

        listaSignos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, perfis[position], Toast.LENGTH_LONG).show();
    }
}
