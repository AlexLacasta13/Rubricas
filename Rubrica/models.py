from odoo.exceptions import ValidationError
from odoo import models, fields, api

class persona(models.Model):
    _name="rubrica.persona"

    dni=fields.Char("Dni de la persona")
    name=fields.Char("nombre de la persona")
    apellidos=fields.Char("Apellidos de la persona")
    direccion=fields.Text("Direccion de la persona")
    telefono=fields.Char("telefono de contacto")
    peso=fields.Integer("Peso de la persona")
    altura=fields.Integer("Altura de la persona")
    imc=fields.Integer("Indice de masa corporal")

    @api.onchange('peso', 'altura')
    def _onchange_price(self):
        self.imc = self.peso * self.altura

class estudiante(models.Model):
    _inherit="rubrica.persona"
    _name="rubrica.estudiante"

    curso=fields.Char("Curso del estudiante")
    descripcion=fields.Text("Descripcion del estudiante")






    




    



