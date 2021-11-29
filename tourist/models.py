# -*- coding: utf-8 -*-
import random
from odoo import models, fields, api

from openerp.exceptions import ValidationError

class Provincia(models.Model):
    _name = 'touring.provincia'
    name = fields.Char(string="Nombre provincia", required=True)
    poblacion_id = fields.One2many('touring.poblacion',
                                   'provincia_id',
                                   string="Poblacion")


class Poblacion(models.Model):
    _name = 'touring.poblacion'
    name = fields.Char(string="Nombre poblacion", required=True)
    provincia_id = fields.Many2one('touring.provincia', string="Provincia")



