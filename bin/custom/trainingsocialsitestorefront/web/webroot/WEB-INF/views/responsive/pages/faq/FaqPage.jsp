<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>

<template:page pageTitle="${pageTitle}">
    <cms:pageSlot position="FaqParagraph" var="feature" element="div">
        <cms:component component="${feature}" element="div"/>
    </cms:pageSlot>
</template:page>