package org.javacodegeeks.webservices.rest.ticket.service;

import java.util.List;

import org.javacodegeeks.webservices.rest.ticket.domain.Comment;
import org.javacodegeeks.webservices.rest.ticket.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	// --------------------------------------------
	// CRUD OPERATIONS FOR PARENT RECORDS (TICKETS)

	public Ticket createTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	public List findAll() {
		return ticketRepository.findAll();
	}

	public Ticket findTicket(long id) {
		return ticketRepository.getById(id);
	}

	public Ticket updateTicket(long id, Ticket ticket) {
		Ticket updatedTicket = findTicket(id);
		if (!ticket.getDescription().equals(updatedTicket.getDescription())) {
			updatedTicket.setDescription(ticket.getDescription());
			return ticketRepository.save(updatedTicket);
		} else
			return null;
	}

	public void deleteById(long id) {
		Ticket ticket = ticketRepository.getById(id);
		ticketRepository.delete(ticket);
	}

	@Autowired
	private CommentRepository commentRepository;

	// --------------------------------------------
	// CRUD OPERATIONS FOR CHILD RECORDS (COMMENTS)

	public Ticket createComment(long ticketId, Comment comment) {
		Ticket ticket = findTicket(ticketId);
		comment.setTicket(ticket);
		ticket.getComments().add(comment);

		return ticketRepository.save(ticket);
	}

	public List findAllComments(long ticketId) {
		return findTicket(ticketId).getComments();
	}

	public Comment findComment(long id) {
		return commentRepository.getById(id);
	}

	public Comment updateComment(long commentId, Comment comment) {
		Comment savedComment = commentRepository.getById(commentId);
		savedComment.setText(comment.getText());
		commentRepository.save(savedComment);
		return savedComment;
	}

	public void deleteCommentById(long id) {
		Comment comment = commentRepository.getById(id);
		commentRepository.delete(comment);
	}
}
