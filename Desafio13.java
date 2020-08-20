package albino;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Desafio13 {

	//VENDAS
	static ArrayList<String> vendas = new ArrayList<String>();
	static ArrayList<Double> vendasValorCusto = new ArrayList<Double>();
	static ArrayList<Double> vendasValorFinal = new ArrayList<Double>();

	static ArrayList<String> produtos= new ArrayList<String>();
	static ArrayList<Double> produtosValorCusto = new ArrayList<Double>();
	static ArrayList<Double> produtosValorVenda = new ArrayList<Double>();


	//SALGADINHO
	static ArrayList<String> salgadinhos = new ArrayList<String>();
	static ArrayList<Double> salgadinhosValorCusto = new ArrayList<Double>();
	static ArrayList<Double> salgadinhosValorVenda = new ArrayList<Double>();
	//DOCE
	static ArrayList<String> doces = new ArrayList<String>();
	static ArrayList<Double> docesValorCusto = new ArrayList<Double>();
	static ArrayList<Double> docesValorVenda = new ArrayList<Double>();	
	//BEBIDA
	static ArrayList<String> bebidas = new ArrayList<String>();
	static ArrayList<Double> bebidasValorCusto = new ArrayList<Double>();
	static ArrayList<Double> bebidasValorVenda = new ArrayList<Double>();


	public static void main(String[] args) {


		String salgadinho = "", doce = "", bebida = "";
		Double salgadinhoValorCusto, salgadinhoValorVenda, doceValorCusto, doceValorVenda, bebidaValorCusto, bebidaValorVenda;
		int controle = -1;



		StringBuffer menu = new StringBuffer();
		menu.append("1 - Cadastro Produto");
		menu.append("\n");
		menu.append("2 - Listar Produtos");
		menu.append("\n");
		menu.append("3 - Alterar Produto");
		menu.append("\n");
		menu.append("4 - Remover Produto");
		menu.append("\n");
		menu.append("5 - Efetuar venda produto");
		menu.append("\n");
		menu.append("6 - Total vendas");
		menu.append("\n");
		menu.append("7 - Total Lucro");
		menu.append("\n");
		menu.append("0 - Sair");


		controle = jopInt(menu.toString());


		salgadinhos.add("Pastel");
		salgadinhosValorCusto.add(5D);
		salgadinhosValorVenda.add(7D);

		salgadinhos.add("Risólis");
		salgadinhosValorCusto.add(4.5);
		salgadinhosValorVenda.add(7D);

		salgadinhos.add("Coxinha");
		salgadinhosValorCusto.add(3D);
		salgadinhosValorVenda.add(5D);

		doces.add("Brigadeiro");
		docesValorCusto.add(3D);
		docesValorVenda.add(5D);

		doces.add("Cajú");
		docesValorCusto.add(3D);
		docesValorVenda.add(5D);

		bebidas.add("Água");
		bebidasValorCusto.add(1.5);
		bebidasValorVenda.add(3D);

		bebidas.add("Pepsi");
		bebidasValorCusto.add(2D);
		bebidasValorVenda.add(5D);

		bebidas.add("Coca Cola");
		bebidasValorCusto.add(2D);
		bebidasValorVenda.add(6D);

		produtos.addAll(salgadinhos);
		produtos.addAll(doces);
		produtos.addAll(bebidas);

		produtosValorCusto.addAll(salgadinhosValorCusto);
		produtosValorCusto.addAll(docesValorCusto);
		produtosValorCusto.addAll(bebidasValorCusto);

		produtosValorVenda.addAll(salgadinhosValorVenda);
		produtosValorVenda.addAll(docesValorVenda);
		produtosValorVenda.addAll(bebidasValorVenda);

		while (controle != 0) {

			switch (controle) {
			case 1:
				//1 - Cadastro Produto
				int controleCategoria = -1;

				StringBuffer menuCategoria = new StringBuffer();
				menuCategoria.append("1 - Salgadinho");
				menuCategoria.append("\n");
				menuCategoria.append("2 - Doce");
				menuCategoria.append("\n");
				menuCategoria.append("3 - Bebida");
				menuCategoria.append("\n");
				menuCategoria.append("0 - Voltar");

				controleCategoria = jopInt(menuCategoria.toString());

				//while (controleCategoria != 0) {



				switch (controleCategoria) {
				case 1:
					salgadinho = jopStr("Digite o SALGADINHO que você deseja cadastrar:");
					salgadinhoValorCusto = jopDoub("Digite o valor de CUSTO do SALGADINHO");
					salgadinhoValorVenda = jopDoub("Digite o valor de VENDA do SALGADINHO");

					incluirSalgadinho(salgadinho, salgadinhoValorCusto, salgadinhoValorVenda);
					produtos.add(salgadinho);
					produtosValorCusto.add(salgadinhoValorCusto);
					produtosValorVenda.add(salgadinhoValorVenda);

					break;
				case 2:

					doce = jopStr("Digite o DOCE que você deseja cadastrar:");
					doceValorCusto = jopDoub("Digite o valor de CUSTO do DOCE");
					doceValorVenda = jopDoub("Digite o valor de VENDA do DOCE");

					incluirDoce(doce, doceValorCusto, doceValorVenda);
					produtos.add(doce);
					produtosValorCusto.add(doceValorCusto);
					produtosValorVenda.add(doceValorVenda);
					break;

				case 3:

					bebida = jopStr("Digite o BEBIDA que você deseja cadastrar:");
					bebidaValorCusto = jopDoub("Digite o valor de CUSTO do DOCE");
					bebidaValorVenda = jopDoub("Digite o valor de VENDA do DOCE");

					incluirBebida(bebida, bebidaValorCusto, bebidaValorVenda);
					produtos.add(bebida);
					produtosValorCusto.add(bebidaValorCusto);
					produtosValorVenda.add(bebidaValorVenda);

					break;

				default:
					break;
					//}
				}


				break;

			case 2:
				//2 - Listar Produtos
				int controleListar = -1;

				StringBuffer menuListar = new StringBuffer();
				menuListar.append("O que voce deseja listar?");
				menuListar.append("\n");
				menuListar.append("1 - Salgadinhos");
				menuListar.append("\n");
				menuListar.append("2 - Doces");
				menuListar.append("\n");
				menuListar.append("3 - Bebidas");
				menuListar.append("\n");
				menuListar.append("4 - Todos");
				menuListar.append("\n");
				menuListar.append("0 - Voltar");

				controleListar = jopInt(menuListar.toString());

				if (controleListar == 1) {

					jop(listarSalgadinhos());

				}
				else if (controleListar == 2){

					jop(listarDoces());
				}
				else if (controleListar == 3){

					jop(listarBebidas());
				}
				else if  (controleListar == 4){
					jop(listarSalgadinhos()+listarDoces()+listarBebidas());
				}
				break;

			case 3:
				//3 - Alterar Produto
				int controleAlterar = -1, indice;

				StringBuffer menuAlterar = new StringBuffer();
				menuAlterar.append("O que voce deseja ALTERAR?");
				menuAlterar.append("\n");
				menuAlterar.append("1 - Salgadinhos");
				menuAlterar.append("\n");
				menuAlterar.append("2 - Doces");
				menuAlterar.append("\n");
				menuAlterar.append("3 - Bebidas");
				menuAlterar.append("\n");
				menuAlterar.append("0 - Voltar");

				controleAlterar = jopInt(menuAlterar.toString());

				if (controleAlterar == 1) {
					if (!salgadinhos.isEmpty()) {

						indice = jopInt(listaIndiceSalgadinho());
						salgadinho = jopStr("Digite o novo nome de "+ salgadinhos.get(indice)+ " que você deseja alterar:");
						salgadinhoValorCusto = jopDoub("Digite o novo valor de CUSTO do SALGADINHO "+ salgadinho);
						salgadinhoValorVenda = jopDoub("Digite o novo valor de VENDA do SALGADINH O"+ salgadinho );
						alterarSalgadinho(indice, salgadinho, salgadinhoValorCusto, salgadinhoValorVenda);
						produtos.remove(salgadinhos.get(indice));
						produtosValorCusto.remove(salgadinhosValorCusto.get(indice));
						produtosValorVenda.remove(salgadinhosValorVenda.get(indice));
						produtos.add(salgadinhos.get(indice));
						produtosValorCusto.add(salgadinhosValorCusto.get(indice));
						produtosValorVenda.add(salgadinhosValorVenda.get(indice));
					}else {
						jop("Nenhum salgadinho cadastrado, impossível alterar!");
					}
				}
				else if (controleAlterar == 2){
					if (!doces.isEmpty()) {
						indice = jopInt(listaIndiceDoces());
						doce = jopStr("Digite o novo nome de "+ doces.get(indice)+ " que você deseja alterar:");
						doceValorCusto = jopDoub("Digite o novo valor de CUSTO do DOCE"+ doce);
						doceValorVenda = jopDoub("Digite o novo valor de VENDA do DOCE"+ doce);
						alterarDoce(indice, doce, doceValorCusto, doceValorVenda);
						produtos.remove(doces.get(indice));
						produtosValorCusto.remove(docesValorCusto.get(indice));
						produtosValorVenda.remove(docesValorVenda.get(indice));
						produtos.add(doces.get(indice));
						produtosValorCusto.add(docesValorCusto.get(indice));
						produtosValorVenda.add(docesValorVenda.get(indice));
					}else{
						jop("Nenhum doce cadastrado, impossível alterar!");
					}
				}
				else if (controleAlterar == 3){
					if (!bebidas.isEmpty()) {
						indice = jopInt(listaIndiceBebidas());
						bebida = jopStr("Digite o novo nome da bebida "+ bebidas.get(indice)+ " que você deseja alterar:");
						bebidaValorCusto = jopDoub("Digite o novo valor de CUSTO da BEBIDA "+ bebida);
						bebidaValorVenda = jopDoub("Digite o novo valor de VENDA da BEBIDA "+ bebida);
						alterarBebida(indice, bebida, bebidaValorCusto, bebidaValorVenda);
						produtos.remove(bebidas.get(indice));
						produtosValorCusto.remove(bebidasValorCusto.get(indice));
						produtosValorVenda.remove(bebidasValorVenda.get(indice));
						produtos.add(bebidas.get(indice));
						produtosValorCusto.add(bebidasValorCusto.get(indice));
						produtosValorVenda.add(bebidasValorVenda.get(indice));
					}else{
						jop("Nenhuma bebida cadastrada, impossível alterar!");
					}
				}
				break;

			case 4:
				//4 - Remover Produto
				int controleRemover = -1, indiceRemover;

				StringBuffer menuRemover = new StringBuffer();
				menuRemover.append("O que voce deseja Remover?");
				menuRemover.append("\n");
				menuRemover.append("1 - Salgadinhos");
				menuRemover.append("\n");
				menuRemover.append("2 - Doces");
				menuRemover.append("\n");
				menuRemover.append("3 - Bebidas");
				menuRemover.append("\n");
				menuRemover.append("0 - Voltar");

				controleRemover = jopInt(menuRemover.toString());

				if (controleRemover == 1) {
					if (!salgadinhos.isEmpty()) {

						indiceRemover = jopInt(listaIndiceSalgadinho());
						jop("SALGADINHO " +salgadinhos.get(indiceRemover)+ " removido!");
						removerSalgadinho(indiceRemover);
						produtos.remove(salgadinhos.get(indiceRemover));
						produtosValorCusto.remove(salgadinhosValorCusto.get(indiceRemover));
						produtosValorVenda.remove(salgadinhosValorVenda.get(indiceRemover));
					}else {
						jop("Nenhum salgadinho cadastrado, impossível remover!");
					}
				}
				else if (controleRemover == 2){
					if (!doces.isEmpty()) {
						indiceRemover = jopInt(listaIndiceDoces());
						jop("DOCE "+doces.get(indiceRemover)+" removido!" );
						removerDoce(indiceRemover);
						produtos.remove(doces.get(indiceRemover));
						produtosValorCusto.remove(docesValorCusto.get(indiceRemover));
						produtosValorVenda.remove(docesValorVenda.get(indiceRemover));
					}else{
						jop("Nenhum doce cadastrado, impossível remover!");
					}
				}
				else if (controleRemover == 3){
					if (!bebidas.isEmpty()) {
						indiceRemover = jopInt(listaIndiceBebidas());
						jop("BEBIDA "+bebidas.get(indiceRemover)+" removida!");
						removerBebida(indiceRemover);
						produtos.remove(bebidas.get(indiceRemover));
						produtosValorCusto.remove(bebidasValorCusto.get(indiceRemover));
						produtosValorVenda.remove(bebidasValorVenda.get(indiceRemover));

					}else{
						jop("Nenhuma bebida cadastrada, impossível remover!");
					}
				}
				break;

			case 5:
				//5 - Efetuar venda produto

				int indiceVenda;
				Double produtoValorCusto, produtoValorVenda;
				String produto;


				if (!salgadinhos.isEmpty()) {

					indiceVenda= jopInt(listaIndiceGeral());
					produto = produtos.get(indiceVenda);
					produtoValorCusto = produtosValorCusto.get(indiceVenda);
					produtoValorVenda = produtosValorVenda.get(indiceVenda);

					incluirVenda(indiceVenda, produto, produtoValorCusto, produtoValorVenda);
				}else {
					jop("Nenhum salgadinho cadastrado, impossível vender!");
				}					



				break;

			case 6:
				//6 - TOTAL VENDAS
				jop(listaVendas());
			
				break;

			case 7:
				//7 - Total Lucro
				Double lucro = 0D, somaVendasCusto = 0d, somaVendasFinal = 0d; 
				for (int i = 0; i < vendasValorCusto.size(); i++) {
					somaVendasCusto += vendasValorCusto.get(i);
				}

				for(int i = 0; i < vendasValorFinal.size(); i++){
					somaVendasFinal += vendasValorFinal.get(i);
				}

				lucro = somaVendasFinal - somaVendasCusto;

				jop("Lucro líquido R$ " +lucro);
				break;




			default:
				break;
			}
			controle = jopInt(menu.toString());
		}

	}
	public static Integer jopInt                  (String mensagem) {

		Integer numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
		return numero;
	}
	public static  Double  jopDoub                 (String mensagem) {

		Double numero = 0.0;
		numero = Double.parseDouble(JOptionPane.showInputDialog(mensagem));
		return numero;
	}
	public static String  jopStr                  (String mensagem) {

		String texto = "";
		texto = JOptionPane.showInputDialog(mensagem);
		return texto;
	}
	public static void    jop                     (String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	public static void    incluirSalgadinho          (String salgadinho, Double salgadinhoValorCusto, Double salgadinhoValorVenda) {
		salgadinhos.add(salgadinho);
		salgadinhosValorCusto.add(salgadinhoValorCusto);
		salgadinhosValorVenda.add(salgadinhoValorVenda);
		jop("SALGADINHO "+ salgadinho+ " adicionado!");

	}	
	public static void    removerSalgadinho          (int indice) {
		salgadinhos.remove(indice);
		salgadinhosValorCusto.remove(indice);
		salgadinhosValorVenda.remove(indice);


	}	
	public static void    incluirDoce          (String doce, Double doceValorCusto, Double doceValorVenda) {
		doces.add(doce);
		docesValorCusto.add(doceValorCusto);
		docesValorVenda.add(doceValorVenda);
		jop("DOCE "+ doce+ " adicionado!");

	}
	public static void    removerDoce          (int indice) {
		doces.remove(indice);
		docesValorCusto.remove(indice);
		docesValorVenda.remove(indice);

	}	
	public static void    incluirBebida          (String bebida, Double bebidaValorCusto, Double bebidaValorVenda) {
		bebidas.add(bebida);
		bebidasValorCusto.add(bebidaValorCusto);
		bebidasValorVenda.add(bebidaValorVenda);
		jop("BEBIDA "+ bebida + " adicionado!");

	}
	public static void    removerBebida          (int indice) {
		bebidas.remove(indice);
		bebidasValorCusto.remove(indice);
		bebidasValorVenda.remove(indice);


	}
	public static String  listarSalgadinhos() {
		// Concatenar listas no view
		System.out.println("entrou listar");
		StringBuffer listaSalgadinhos = new StringBuffer();
		listaSalgadinhos.append("Lista de Salgadinhos!");
		listaSalgadinhos.append("\n");
		listaSalgadinhos.append("========================");
		listaSalgadinhos.append("\n");

		for (int i = 0; i < salgadinhos.size(); i++) {

			listaSalgadinhos.append("Salgadinho: ");
			listaSalgadinhos.append(salgadinhos.get(i));
			listaSalgadinhos.append("\n");
			listaSalgadinhos.append("Valor Custo R$");
			listaSalgadinhos.append(salgadinhosValorCusto.get(i));
			listaSalgadinhos.append("\n");
			listaSalgadinhos.append("Valor Venda R$");
			listaSalgadinhos.append(salgadinhosValorVenda.get(i));
			listaSalgadinhos.append("\n");
			listaSalgadinhos.append("\n");
		}

		return listaSalgadinhos.toString();
	}
	public static String  listarDoces() {
		StringBuffer listaDoces = new StringBuffer();
		listaDoces.append("========================");
		listaDoces.append("\n");
		listaDoces.append("Lista de Doces!");
		listaDoces.append("\n");
		listaDoces.append("========================");
		listaDoces.append("\n");

		for (int j = 0; j < doces.size(); j++) {

			listaDoces.append("Doce: ");
			listaDoces.append(doces.get(j));
			listaDoces.append("\n");
			listaDoces.append("Valor Custo R$");
			listaDoces.append(docesValorCusto.get(j));
			listaDoces.append("\n");
			listaDoces.append("Valor Venda R$");
			listaDoces.append(docesValorVenda.get(j));
			listaDoces.append("\n");
			listaDoces.append("\n");
		}
		return listaDoces.toString();
	}
	public static String  listarBebidas() {
		StringBuffer listaBebidas = new StringBuffer();
		listaBebidas.append("========================");
		listaBebidas.append("\n");
		listaBebidas.append("Lista de Bebidas!");
		listaBebidas.append("\n");
		listaBebidas.append("========================");
		listaBebidas.append("\n");
		for (int i = 0; i < bebidas.size(); i++) {

			listaBebidas.append("Bebida: ");
			listaBebidas.append(bebidas.get(i));
			listaBebidas.append("\n");
			listaBebidas.append("Valor Custo R$");
			listaBebidas.append(bebidasValorCusto.get(i));
			listaBebidas.append("\n");
			listaBebidas.append("Valor Venda R$");
			listaBebidas.append(bebidasValorVenda.get(i));
			listaBebidas.append("\n");
			listaBebidas.append("\n");
		}
		return listaBebidas.toString();
	}
	public static String  listaIndiceSalgadinho() {
		StringBuffer lista = new StringBuffer();
		lista.append("Lista de SALGADINHOS por índice!");
		lista.append("\n");
		lista.append("========================");
		lista.append("\n");

		for (int i = 0; i < salgadinhos.size(); i++) {
			lista.append(i+" - Salgadinho: "+salgadinhos.get(i));
			lista.append("\n");

		}
		return lista.toString();
	}
	public static String  listaIndiceDoces() {
		StringBuffer lista = new StringBuffer();
		lista.append("Lista de DOCES por índice!");
		lista.append("\n");
		lista.append("========================");
		lista.append("\n");

		for (int i = 0; i < doces.size(); i++) {
			lista.append(i+" - Doce: "+doces.get(i));
			lista.append("\n");

		}
		return lista.toString();
	}
	public static String  listaIndiceBebidas() {
		StringBuffer lista = new StringBuffer();
		lista.append("Lista de BEBIDAS por índice!");
		lista.append("\n");
		lista.append("========================");
		lista.append("\n");

		for (int i = 0; i < bebidas.size(); i++) {
			lista.append(i+" - Bebida: "+bebidas.get(i));
			lista.append("\n");

		}
		return lista.toString();
	}
	public static String  listaIndiceVenda() {
		StringBuffer lista = new StringBuffer();
		lista.append("Lista de VENDAS por índice!");
		lista.append("\n");
		lista.append("========================");
		lista.append("\n");

		for (int i = 0; i < vendas.size(); i++) {
			lista.append(i+" - Venda: "+vendas.get(i));
			lista.append("\n");

		}
		return lista.toString();
	}
	public static String  listaVendas() {
		Double totalVendas = 0.0;
		StringBuffer lista = new StringBuffer();
		lista.append("Lista de VENDAS!");
		lista.append("\n");
		lista.append("========================");
		lista.append("\n");

		for (int i = 0; i < vendas.size(); i++) {
			lista.append(" - Venda: "+vendas.get(i));
			lista.append("\n");
			lista.append(" - Valor custo R$: "+vendasValorCusto.get(i));
			lista.append("\n");
			lista.append(" - Valor final R$"+vendasValorFinal.get(i));
			lista.append("\n");
			lista.append("========================");
			lista.append("\n");
		}
		for(int i = 0; i < vendasValorFinal.size(); i++){
			totalVendas += vendasValorFinal.get(i);
		}
		lista.append("Lucro bruto: R$ "+ totalVendas);
		return lista.toString();
	}

	public static void    alterarSalgadinho          (int indice, String salgadinho, Double salgadinhoValorCusto, Double salgadinhoValorVenda) {
		salgadinhos.remove(indice);
		salgadinhos.add(salgadinho);
		salgadinhosValorCusto.remove(indice);
		salgadinhosValorCusto.add(salgadinhoValorCusto);
		salgadinhosValorVenda.remove(indice);
		salgadinhosValorVenda.add(salgadinhoValorVenda);
		jop("SALGADINHO "+ salgadinho+ " alterado!");

	}	
	public static void    alterarDoce          (int indice, String doce, Double doceValorCusto, Double doceValorVenda) {
		doces.remove(indice);
		doces.add(doce);
		docesValorCusto.remove(indice);
		docesValorCusto.add(doceValorCusto);
		docesValorVenda.remove(indice);
		docesValorVenda.add(doceValorVenda);
		jop("DOCE "+ doce+ " alterado!");

	}
	public static void    alterarBebida          (int indice, String bebida, Double bebidaValorCusto, Double bebidaValorVenda) {
		bebidas.remove(indice);
		bebidas.add(bebida);
		bebidasValorCusto.remove(indice);
		bebidasValorCusto.add(bebidaValorCusto);
		bebidasValorVenda.remove(indice);
		bebidasValorVenda.add(bebidaValorVenda);
		jop("BEBIDA "+ bebida + " alterado!");

	}
	public static void    vender(String produto) {

		vendas.add(produto);


		jop("Venda Realizada!");
	}	
	public static String  listaIndiceGeral() {
		StringBuffer lista = new StringBuffer();

		lista.append("Lista de VENDAS por índice!");
		lista.append("\n");
		lista.append("========================");
		lista.append("\n");

		for (int i = 0; i < produtos.size(); i++) {
			lista.append(i+" - Produto: "+produtos.get(i));
			lista.append("\n");
			lista.append("\n");

		}				 

		return lista.toString();
	}
	public static void    incluirVenda          (int indice, String produto, Double produtoValorCusto, Double produtoValorVenda) {
		vendas.add(produto);
		vendasValorCusto.add(produtoValorCusto);
		vendasValorFinal.add(produtoValorVenda);
		jop("Produto "+ produto+ " vendido!");

	}
}