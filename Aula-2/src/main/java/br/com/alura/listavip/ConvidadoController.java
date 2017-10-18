package br.com.alura.listavip;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.alura.listavip.model.Perguntas;
import br.com.alura.listavip.model.Usuario;
import br.com.alura.listavip.repository.PerguntasRepository;
import br.com.alura.listavip.repository.UsuarioRepository;

@Controller
public class ConvidadoController {

	private PerguntasRepository perguntaRepository;
	private UsuarioRepository usuarioRepository;

	@Autowired
	public ConvidadoController(PerguntasRepository perguntaRepository, UsuarioRepository usuarioRepository) {
		this.perguntaRepository = perguntaRepository;
		this.usuarioRepository = usuarioRepository;
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "logar", method = RequestMethod.POST)
	public String logar(@RequestParam("email") String usuario, @RequestParam("senha") String senha,
			HttpSession session) {
		Usuario user = new Usuario(usuario, senha);
		Usuario achou = usuarioRepository.findByNameAndSenha(usuario, senha);

		if (achou != null) {
			session.setAttribute("usuarioLogado", achou);
			return "listaconvidados";
		}
		return "index";
	}

	@RequestMapping("listaconvidados")
	public String listaConvidados(Model model) {
		Iterable<Perguntas> convidados = perguntaRepository.findAll();
		model.addAttribute("convidados", convidados);
		return "listaconvidados";
	}

	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	public String salvar(@RequestParam("pergunta") String pergunta, @RequestParam("traducao") String traducao) {
		Perguntas perguntas = new Perguntas(pergunta, traducao);
		perguntaRepository.save(perguntas);

		return "redirect:listaconvidados";
	}

}
