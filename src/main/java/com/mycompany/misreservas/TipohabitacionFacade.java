/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.misreservas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author roberto
 */
@Stateless
public class TipohabitacionFacade extends AbstractFacade<Tipohabitacion> {
    @PersistenceContext(unitName = "com.mycompany_misreservas_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipohabitacionFacade() {
        super(Tipohabitacion.class);
    }
    
}
