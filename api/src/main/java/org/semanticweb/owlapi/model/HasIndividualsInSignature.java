package org.semanticweb.owlapi.model;

import java.util.Set;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 29/07/2013
 */
public interface HasIndividualsInSignature {

    /**
     * A convenience method that obtains the individuals
     * that are in the signature of this object
     * @return A set containing the individuals that are in the signature
     *         of this object.The set is a subset of the signature, and
     *         is not backed by the signature; it is a modifiable collection
     *         and changes are not reflected by the signature.
     */
    Set<OWLNamedIndividual> getIndividualsInSignature();
}
