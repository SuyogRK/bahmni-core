package org.bahmni.module.referencedata.labconcepts.service;

import org.openmrs.ConceptMap;

public interface ReferenceDataConceptReferenceTermService {
    public org.openmrs.ConceptReferenceTerm getConceptReferenceTerm(String referenceTermCode, String referenceTermSource);

    public ConceptMap getConceptMap(org.bahmni.module.referencedata.labconcepts.contract.ConceptReferenceTerm conceptReferenceTermData);
}
